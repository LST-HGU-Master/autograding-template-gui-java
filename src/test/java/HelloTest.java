import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.fest.swing.edt.FailOnThreadViolationRepaintManager;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;

public class HelloTest {

    private FrameFixture fixture;

    @BeforeAll
    public static void beforeClass() {
        FailOnThreadViolationRepaintManager.install();
    }

    @BeforeEach
    public void before() {
        // 新たにウィンドウを作成する
        Hello window = GuiActionRunner.execute(new GuiQuery<Hello>() {
            @Override
            protected Hello executeInEDT() throws Throwable {
                return new Hello();
            }
        });
        fixture = new FrameFixture(window);
        fixture.show();
    }

    @AfterEach
    public void after() {
        fixture.cleanUp();
    }

    @Test
    public void testLabelName() {
        fixture.label("label1").requireText("Hello");
    }


}
