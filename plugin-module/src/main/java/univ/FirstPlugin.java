package univ;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * 不与任何阶段绑定的goal<br>
 *
 * 1. AbstractMojo是一个抽象类,其实现了Mojo接口,execute是Mojo接口的方法; <br>
 * 2. 必须使用@Mojo注解修饰,name的值是吃插件的goal值; <br>
 * 3. 一个目标(goal)就对应一个Mojo类；
 * @author univ
 */

@Mojo(name="first")
public class FirstPlugin extends AbstractMojo {

    /**
     * 别忘了@Parameter，此时才能接收configuration配置的参数；
     * 同时，不需要Getter与Setter方法
     */
    @Parameter(property = "name")
    private String name;

    @Parameter(property = "first")
    private String first;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hello, maven plugin ,this is my first plugin. 默认没有和任何阶段绑定");
        System.out.println("配置的参数为, name:" + name + ", first: " + first);
    }
}
