package com.nt.test;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.AppConfig;

public class SpringI18nTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Locale locale = new Locale(args[0], args[1]);

		String msg = ctx.getMessage("wishMsg1" + "{0}", new Object[] { "buddy", new Date() },
				"No data found:: " + "{0}" + " at -->" + "{1,time}", locale);

		System.out.println(msg);

		String msg1 = ctx.getMessage("wishMsg", null, locale);
		String msg2 = ctx.getMessage("welcome.msg", null, locale);
		String msg3 = ctx.getMessage("bye.msg", null, locale);

		System.out.println(msg1 + "   " + msg2 + "   " + msg3);

		((AbstractApplicationContext) ctx).close();
	}

}
