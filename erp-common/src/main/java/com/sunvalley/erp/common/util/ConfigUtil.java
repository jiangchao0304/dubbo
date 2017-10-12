/*
* Copyright (c) 2014 HFY. All Rights Reserved.
*/
package com.sunvalley.erp.common.util;
import com.google.common.collect.Maps;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/**
 * Properties文件载入工具类. 可载入多个properties文件, 相同的属性在最后载入的文件中的值将会覆盖之前的值，但以System的Property优先.
 *
 *
 */
public class ConfigUtil {

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();
    private static final String NAME_PREFIX = "#{";
    private static final String VALUE_PREFIX = "${";
    private static final String SUFFIX = "}";

    private static Logger logger = LoggerFactory.getLogger(ConfigUtil.class);

    private static ResourceLoader resourceLoader = new DefaultResourceLoader();

    private static Properties properties;

    public  ConfigUtil() {
        properties = loadProperties("config.properties");
    }

    public Properties getProperties() {
        return properties;
    }

    /**
     * 取出Property。
     */
    private static String getValue(String key) {

        if(properties==null){
            properties = loadProperties("config.properties");
        }
        String value = map.get(key);
        if (value == null) {
            value = properties.getProperty(key);
            if (value != null){
                map.put(key, value);
            }
        }
        return value;

    }

    /**
     * 取出String类型的Property,如果都為Null则抛出异常.
     */
    public static String getProperty(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return value;
    }

    /**
     * 取出String类型的Property.如果都為Null則返回Default值.
     */
    public static String getProperty(String key, String defaultValue) {
        String value = getValue(key);
        return value != null ? value : defaultValue;
    }

    /**
     * 取出Integer类型的Property.如果都為Null或内容错误则抛出异常.
     */
    public static Integer getInteger(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Integer.valueOf(value);
    }

    /**
     * 取出Integer类型的Property.如果都為Null則返回Default值，如果内容错误则抛出异常
     */
    public static Integer getInteger(String key, Integer defaultValue) {
        String value = getValue(key);
        return value != null ? Integer.valueOf(value) : defaultValue;
    }

    /**
     * 取出Double类型的Property.如果都為Null或内容错误则抛出异常.
     */
    public static Double getDouble(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Double.valueOf(value);
    }

    /**
     * 取出Double类型的Property.如果都為Null則返回Default值，如果内容错误则抛出异常
     */
    public static Double getDouble(String key, Integer defaultValue) {
        String value = getValue(key);
        return value != null ? Double.valueOf(value) : defaultValue;
    }

    /**
     * 取出Boolean类型的Property.如果都為Null抛出异常,如果内容不是true/false则返回false.
     */
    public static Boolean getBoolean(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Boolean.valueOf(value);
    }

    /**
     * 取出Boolean类型的Propert.如果都為Null則返回Default值,如果内容不为true/false则返回false.
     */
    public static Boolean getBoolean(String key, boolean defaultValue) {
        String value = getValue(key);
        return value != null ? Boolean.valueOf(value) : defaultValue;
    }

    /**
     * 载入多个文件, 文件路径使用Spring Resource格式.
     */
    private static  Properties loadProperties(String... resourcesPaths) {
        Properties props = new Properties();

        for (String location : resourcesPaths) {

            logger.debug("Loading properties file from path:{}", location);

            InputStream is = null;
            try {
                Resource resource = resourceLoader.getResource(location);
                is = resource.getInputStream();

                String propsStr = IOUtils.toString(is, "UTF-8");

                is = IOUtils.toInputStream(propsStr,"UTF-8");


                props.load(is);

                for (Enumeration<?> i1 = props.keys(); i1.hasMoreElements(); ) {
                    String name1 = (String) i1.nextElement();

                    propsStr = propsStr.replace(VALUE_PREFIX + name1 + SUFFIX,
                            props.getProperty(name1));
                }

                is = IOUtils.toInputStream(propsStr,"UTF-8");

                props.load(is);

            } catch (IOException ex) {
                logger.info("Could not load properties from path:{}, {} ", location, ex.getMessage());
            } finally {
                IOUtils.closeQuietly(is);
            }
        }
        return props;
    }
}
