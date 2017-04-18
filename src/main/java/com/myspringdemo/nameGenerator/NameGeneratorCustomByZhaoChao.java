package com.myspringdemo.nameGenerator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

/**
 * Created by treebear on 2017/4/17.
 */
public class NameGeneratorCustomByZhaoChao implements BeanNameGenerator {
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {

        String id = ClassUtils.getShortName(definition.getBeanClassName().toUpperCase());

        System.out.println(id);

        return  id;
    }
}
