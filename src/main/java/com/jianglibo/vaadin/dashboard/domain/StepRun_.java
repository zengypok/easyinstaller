package com.jianglibo.vaadin.dashboard.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-16T21:19:21.236+0800")
@StaticMetamodel(StepRun.class)
public class StepRun_ extends BaseEntity_ {
	public static volatile SingularAttribute<StepRun, String> name;
	public static volatile SingularAttribute<StepRun, String> ostype;
	public static volatile SingularAttribute<StepRun, StepDefine> stepDefine;
	public static volatile SingularAttribute<StepRun, Install> install;
	public static volatile SingularAttribute<StepRun, String> uniqueFileName;
	public static volatile SingularAttribute<StepRun, JschExecuteResult> result;
	public static volatile SingularAttribute<StepRun, Integer> position;
	public static volatile SingularAttribute<StepRun, String> infoContent;
	public static volatile SingularAttribute<StepRun, String> codeContent;
}
