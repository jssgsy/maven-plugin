package com.univ;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * created by Univ
 * 16/6/5 20:12
 * 1. AbstractMojo是一个抽象类,其实现了Mojo接口,execute是Mojo接口的方法;
 * 2. 必须使用@Mojo注解修饰,name的值是吃插件的goal值
 */

@Mojo(name="sayhi")
public class FirstPlugin extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello, maven plugin ,this is my first plugin.");
    }
}
