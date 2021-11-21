package ru.sdetteam.easygauge.tests;

import com.thoughtworks.gauge.Step;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginSpec {

    @Step("Goto mantis page.")
    public void openURL (){
        open("http://192.168.0.52");
    }

    @Step("Write login data <login> <pass>.")
    public void writeLogin(final String login, final String pass){
        $(byId("username")).setValue(login);
        $(byText("Войти")).click();
        $(byId("password")).setValue(pass);
        $(byText("Войти")).click();
    }
}
