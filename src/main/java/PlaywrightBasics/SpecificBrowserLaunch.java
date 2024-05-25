package PlaywrightBasics;

import com.microsoft.playwright.*;

public class SpecificBrowserLaunch {

    public static void main(String[] args) {

        Playwright playwright=Playwright.create();

        // this launches chromium broswer always
       // playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        // in case we need to launch chrome broswer specifically.
        BrowserType.LaunchOptions option = new BrowserType.LaunchOptions();
        option.setChannel("chrome");
        option.setHeadless(false);
        Browser browser = playwright.chromium().launch(option);

        BrowserContext context = browser.newContext() ;
        Page page = context.newPage();
        page.navigate("https://www.amazon.com");
        String url = page.url();
        System.out.println(url);
        String title = page.title();
        System.out.println(title);
        browser.close();
        playwright.close();


    }
}
