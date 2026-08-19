package com.tsri.hellovaadindemo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route("")
public class HelloView extends VerticalLayout {

    public HelloView() {

        H1 hello = new H1("HELLO!!");

        TextField input = new TextField("請輸入文字");

        input.setValueChangeMode(ValueChangeMode.EAGER);

        input.addValueChangeListener(event -> {

            String value = event.getValue();

            if (value == null || value.trim().isEmpty()) {
                hello.setText("HELLO!!");
            } else {
                hello.setText("HELLO " + value + "!!!!!");
            }
        });

        add(hello, input);
    }
}