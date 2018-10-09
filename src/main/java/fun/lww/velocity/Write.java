package fun.lww.velocity;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.StringWriter;

public class Write {

    public void test() {
        Velocity.init();
        VelocityContext context = new VelocityContext();
        context.put("name", "li");
        Template template = Velocity.getTemplate("a.vm");
        StringWriter writer = new StringWriter();
        template.merge(context, writer);
    }
}
