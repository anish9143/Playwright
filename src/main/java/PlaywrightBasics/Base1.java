package PlaywrightBasics;

import com.microsoft.playwright.*;

public class Base1 {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        String title = page.title();
        System.out.println("title of the page is :" +title);
        String url = page.url();
        System.out.println("url of the page is :" +url);
        browser.close();

    }
}
