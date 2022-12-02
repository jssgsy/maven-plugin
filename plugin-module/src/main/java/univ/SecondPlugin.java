package univ;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * 默认与compile阶段绑定的goal
 *
 * @author univ
 * 2021/7/12 5:27 下午
 */
@Mojo(name = "second", defaultPhase = LifecyclePhase.COMPILE)
public class SecondPlugin extends AbstractMojo {

    @Parameter(property = "name")
    private String name;

    @Parameter(property = "second")
    private String second;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("this is output of plugin [SecondPlugin] 's [guess] goal， 默认绑定的阶段是compile");
        System.out.println("配置的参数为, name:" + name + ", second: " + second);
    }
}
