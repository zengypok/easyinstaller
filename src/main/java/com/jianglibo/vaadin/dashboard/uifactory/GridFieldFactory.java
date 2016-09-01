package com.jianglibo.vaadin.dashboard.uifactory;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.jianglibo.vaadin.dashboard.annotation.VaadinFormFieldWrapper;
import com.jianglibo.vaadin.dashboard.annotation.VaadinTableWrapper;
import com.jianglibo.vaadin.dashboard.domain.BaseEntity;
import com.jianglibo.vaadin.dashboard.uicomponent.gridfield.GridField;

@Component
public class GridFieldFactory {

	@Autowired
	private ApplicationContext applicationContext;
	
	@SuppressWarnings("unchecked")
	public GridField<Collection<? extends BaseEntity>> create(VaadinTableWrapper vtw, VaadinFormFieldWrapper vffw) {
		return applicationContext.getBean(GridField.class).afterInjection(vtw, vffw);
	}
}