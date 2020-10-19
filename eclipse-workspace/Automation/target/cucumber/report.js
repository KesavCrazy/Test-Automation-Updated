$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmzOrder2.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Prime Video",
  "description": "",
  "id": "amazon-prime-video",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To check whether the prime video is working fine",
  "description": "",
  "id": "amazon-prime-video;to-check-whether-the-prime-video-is-working-fine",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AmzTest2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is given with landing url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is Entering into menu option",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is clicking toysBabyProducts",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is clicking starRatings",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is clicking on price",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is clicking on product",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is clicking on quantity",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user is clicking on addToCart",
  "keyword": "And "
});
formatter.match({
  "location": "AmzPrime.user_is_given_with_landing_url()"
});
formatter.result({
  "duration": 22221327300,
  "status": "passed"
});
formatter.match({
  "location": "EchoOrder.user_is_entering_into_menu_option()"
});
formatter.result({
  "duration": 2510692200,
  "status": "passed"
});
formatter.match({
  "location": "BabyProducts.user_is_clicking_toysbabyproducts()"
});
formatter.result({
  "duration": 7751000,
  "status": "passed"
});
formatter.match({
  "location": "BabyProducts.user_is_clicking_starratings()"
});
formatter.result({
  "duration": 967299,
  "status": "passed"
});
formatter.match({
  "location": "BabyProducts.user_is_clicking_on_price()"
});
formatter.result({
  "duration": 2642300,
  "status": "passed"
});
formatter.match({
  "location": "BabyProducts.user_is_clicking_on_product()"
});
formatter.result({
  "duration": 997200,
  "status": "passed"
});
formatter.match({
  "location": "EchoOrder.user_is_clicking_on_quantity()"
});
formatter.result({
  "duration": 318549400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//select[@id\u003d\u0027quantity\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-U7MG1A9\u0027, ip: \u0027192.168.43.115\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59321}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d756d9f04088d71cdecf4c6979063f42\n*** Element info: {Using\u003dxpath, value\u003d//select[@id\u003d\u0027quantity\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat PageObject.AmazonHomePageAmzEcho.quantity(AmazonHomePageAmzEcho.java:47)\r\n\tat StepDefinitions.EchoOrder.user_is_clicking_on_quantity(EchoOrder.java:35)\r\n\tat ✽.And user is clicking on quantity(AmzOrder2.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EchoOrder.user_is_clicking_on_addtocart()"
});
formatter.result({
  "status": "skipped"
});
});