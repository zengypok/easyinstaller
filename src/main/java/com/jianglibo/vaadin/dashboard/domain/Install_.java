package com.jianglibo.vaadin.dashboard.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-08-31T19:26:34.121+0800")
@StaticMetamodel(Install.class)
public class Install_ extends BaseEntity_ {
	public static volatile SingularAttribute<Install, Software> software;
	public static volatile SingularAttribute<Install, Box> box;
	public static volatile SingularAttribute<Install, StepRun> lastStep;
	public static volatile ListAttribute<Install, StepRun> stepRuns;
}
