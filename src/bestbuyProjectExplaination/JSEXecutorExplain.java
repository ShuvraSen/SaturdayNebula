package bestbuyProjectExplaination;

public class JSEXecutorExplain {
	/*
	 js.executeScript("arguments[0].scrollIntoView(true);", BestbuyHomePageLocatorsobj.linkComputers_Tablets);

Explanation: This command uses JavaScript to scroll the webpage until the specified element (linkComputers_Tablets) is visible in the viewport.
 The arguments[0] refers to the element passed as the second argument in the executeScript method.
 
 When to use: You should use this when an element is not currently visible in the viewport 
 (i.e., it’s either above or below the current view). 
 For example, if the element is in a scrollable div or you are working with dynamic content (like a carousel),
  this scroll action ensures that the element becomes visible before interacting with it.
 
 When to use: You use this when traditional Selenium click() doesn’t work due to reasons like:
-> The element is overlapped by other elements (like sticky headers, pop-ups, or ads).
-> The element is not clickable because it's hidden or not interactable in the normal way 
(like elements in an iframe or those with lazy loading).
-> The element is dynamically loaded or behaves in a way that prevents standard interaction
 (e.g., animations).
 
 
 Whenever you need to click an element that might not be immediately visible, 
 you can use this JavaScriptExecutor formula:
js.executeScript("arguments[0].click();", BestbuyHomePageLocatorsobj.linkComputers_Tablets);




 
	 */

}
