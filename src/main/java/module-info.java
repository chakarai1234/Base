module Base {
	requires lombok;
	requires java.persistence;
	requires com.fasterxml.jackson.annotation;
	requires spring.web;
	requires org.jetbrains.annotations;
	requires spring.context;
	requires com.fasterxml.jackson.databind;
	exports com.chakarapani.base;
	exports com.chakarapani.base.Entity;
	exports com.chakarapani.base.Enums;
	exports com.chakarapani.base.Response;
}