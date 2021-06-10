package com.example.framework.singleton;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author moubin.mo
 * @date: 2021/2/21 20:47
 */

public class CarFactoryBean implements FactoryBean {
	private String carInfo;

	@Override
	public Object getObject() throws Exception {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxspeed(Integer.valueOf(infos[1]));
		car.setPrise(Double.valueOf(infos[2]));
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
