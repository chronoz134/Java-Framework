
# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
    --background color changed to bleached almond.
    --Header title centered
    --Website title changed
    --Placeholder text added to both filters.
    --Parts title changed to "Car parts"

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    about.html: line 5 title for website added "About us"
        -line 6 link to css added
        -line 9 h1 added for About us text.
        -line 10 flex container div
        -line 11 card container line 12 h3 header for card 1 titled Our mission.
        -line 13-15 paragraph text for card.
        -line 16 h3 header for card 2nd section titled our commitment
        -line 17-19 paragraph text for section.
        -line 20 new card for about us item
        -line 21 h3 header titled Why choose us
        -line 22-27 unordered list, with text listing out company choosability added.
        -line 30 h3 header added titled our vision
        -line 31-34 paragraph text added
        -line 35 header for next section contact us
        -line 36-39 paragraph text added
        -line 40 anchor for contact link added
    about.css: line 1-3 background color changed to blanchedalmond
        -line 5-8 flex container added and additional justify added.
        -line 10-20 item card specifications added for flex boxes.
        -line 21-25 h1 centered on css added
        -line 27-30 h3 bottom margin changed.
        -line 32-35 li margin and border changed
    aboutController
        -lines 1-11 added spring framework controller for mvc to about us page.
    mainscreen.html
        lines-20-23 centered header 1 and added an anchor to about us page



E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
    BootStrapData.Java
        lines 25-123 Added 3 Outsource and 2 in-house parts and 5 products to the sample inventory.



F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
    mainscreen.html
        -lines 91-94 added buy now button next to updated and delete functions on webpage.
    buyconfirmation.html
        -created in src/resources/templates
        -lines 1-13 simple example for html webpage confirmation
    MainScreenController.java
        -lines 57-74 added page redirection to buy confirmation
    ProductServiceImpl.java
        -lines 69-81 added logic for inventory decremental.
    ProductService.java
        line 26 method added for inventory decrement
    purchaserror.html
        line1-13 simple html webpage for error on purchases.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
    part.java
        -line 31-33 added fields for min and max inventory with min annotation for spring
        -line 47-48, 56-57 added constructors for min and max inv.
        -line 104-120 added getters and setters for both min and max inv
    bootstrapdata.java 
        lines 108-109, 94-95, 79-80, 64-65, 47-48: added min and max inventory values to sample inventory.
    outsourcedpartform.html
        lines 9-10 added styling for webpage
        lines 26-30 added additional fields for form on min and max inventory
    insourcedpartform.html
        lines 9-10 added styling for webpage
        lines 26-30 added additional fields for form on min and max inventory

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.


K.  Demonstrate professional communication in the content and presentation of your submission.