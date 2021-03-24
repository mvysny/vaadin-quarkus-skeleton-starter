package org.acme.servlet;

import com.github.mvysny.kaributesting.v10.MockVaadin;
import com.github.mvysny.kaributesting.v10.Routes;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.mvysny.kaributesting.v10.LocatorJ.*;
import static com.github.mvysny.kaributesting.v10.NotificationsKt.expectNotifications;

/**
 * Tests the UI. Uses the Browserless testing approach as provided by the
 * [Karibu Testing](https://github.com/mvysny/karibu-testing) library.
 * @author Martin Vysny <mavi@vaadin.com>
 */
public class MainViewTest extends AbstractAppTest {
    @Test
    public void smokeTest() {
        // Smoke test is a quick test to check that the basic machinery is in place and works.
        // The analogy would be to turn on an electric device (e.g. a coffee maker)
        // then turn it off immediately without even checking whether it actually works or not,
        // and watch whether there is any smoke. If yes, the coffee maker is
        // probably burning from a short-circuit and any further tests are pointless.

        // The root route should be set directly in the UI; let's check whether it is so.
        // This demoes the direct access to the UI and its children and grand-children,
        // which encompasses all visible Vaadin components.
        MainView main = (MainView) UI.getCurrent().getChildren().findFirst().get();

        // However when using this kind of low-level lookups, the code quickly gets
        // pretty complicated. Let's use the _get() function instead,
        // which will walk the UI tree for us.
        _assertOne(MainView.class);
    }

    @Test
    public void testGreeting() {
        // simulate an user input
        _setValue(_get(TextField.class, spec -> spec.withCaption("Your name")), "Martin");

        // simulate a button click as if clicked by the user
        _click(_get(Button.class, spec -> spec.withCaption("Say hello")));

        // look up the notification and assert on its value
        expectNotifications("Hello Martin");
    }
}
