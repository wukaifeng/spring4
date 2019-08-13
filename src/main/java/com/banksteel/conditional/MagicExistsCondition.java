package com.banksteel.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		/*
		 * 借助getRegistry()返回的BeanDefinitionRegistry检查bean定义; 
		 * 借助getBeanFactory()返回的ConfigurableListableBeanFactory检查bean是否存在，甚至探查bean的属性;
		 * 借助getEnvironment()返回的Environment检查环境变量是否存在以及它的值是什么; 
		 * 读取并探查getResourceLoader()返回的ResourceLoader所加载的资源; 
		 * 借助getClassLoader()返回的ClassLoader加载并检查类是否存在。
		 */
		Environment environment = context.getEnvironment();
		boolean annotated = metadata.isAnnotated("aa");
		
		return environment.containsProperty("magic");
	}

}
