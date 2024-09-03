# WESTERN GOVERNORS UNIVERSITY
## D287 – JAVA FRAMEWORKS

### B. Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.
- README file created.

### C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
- **Background color** changed to blanched almond.
- **Header title** centered.
- **Website title** changed.
- **Placeholder text** added to both filters.
- **Parts title** changed to "Car parts".

*Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.*

### D. Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
- **about.html**:
    - Line 5: Title for website added "About us".
    - Line 6: Link to CSS added.
    - Line 9: `<h1>` added for "About us" text.
    - Line 10: Flex container `<div>` added.
    - Line 11: Card container added.
    - Line 12: `<h3>` header for card 1 titled "Our mission".
    - Line 13-15: Paragraph text for card.
    - Line 16: `<h3>` header for card 2nd section titled "Our commitment".
    - Line 17-19: Paragraph text for section.
    - Line 20: New card for "About us" item added.
    - Line 21: `<h3>` header titled "Why choose us".
    - Line 22-27: Unordered list with text listing out company choosability added.
    - Line 30: `<h3>` header added titled "Our vision".
    - Line 31-34: Paragraph text added.
    - Line 35: Header for next section "Contact us".
    - Line 36-39: Paragraph text added.
    - Line 40: Anchor for contact link added.
- **about.css**:
    - Line 1-3: Background color changed to blanchedalmond.
    - Line 5-8: Flex container added and justify-content added.
    - Line 10-20: Item card specifications added for flex boxes.
    - Line 21-25: `<h1>` centered on CSS added.
    - Line 27-30: `<h3>` bottom margin changed.
    - Line 32-35: `<li>` margin and border changed.
- **aboutController**:
    - Lines 1-11: Added Spring framework controller for MVC to about us page.
- **mainscreen.html**:
    - Lines 20-23: Centered `<h1>` header and added an anchor to the about us page.

### E. Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
- **BootStrapData.java**:
    - Lines 25-123: Added 3 Outsource and 2 in-house parts and 5 products to the sample inventory.

### F. Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
- **mainscreen.html**:
    - Lines 91-94: Added "Buy Now" button next to update and delete functions on the webpage.
- **buyconfirmation.html**:
    - Created in `src/resources/templates`.
    - Lines 1-13: Simple HTML webpage confirmation.
- **MainScreenController.java**:
    - Lines 57-74: Added page redirection to buy confirmation.
- **ProductServiceImpl.java**:
    - Lines 69-81: Added logic for inventory decrement.
- **ProductService.java**:
    - Line 26: Method added for inventory decrement.
- **purchaserror.html**:
    - Lines 1-13: Simple HTML webpage for error on purchases.

### G. Modify the parts to track maximum and minimum inventory by doing the following:
- **Part.java**:
    - Lines 31-33: Added fields for min and max inventory with min annotation for Spring.
    - Lines 47-48, 56-57: Added constructors for min and max inventory.
    - Lines 104-120: Added getters and setters for both min and max inventory.
    - Lines 130-133: Method to validate inventory is within min and max parameters.
- **BootStrapData.java**:
    - Lines 47-48, 64-65, 79-80, 94-95, 108-109: Added min and max inventory values to sample inventory.
- **outsourcedpartform.html**:
    - Lines 9-10: Added styling for the webpage.
    - Lines 26-30: Added additional fields for form on min and max inventory.
- **insourcedpartform.html**:
    - Lines 9-10: Added styling for the webpage.
    - Lines 26-30: Added additional fields for form on min and max inventory.
- **application.properties**:
    - Line 6: Updated to showcase file rename of the database.
- **AddInhousePartController.java**:
    - Lines 40-59: Refactored code to accommodate min and max inventory logic and validation for errors.
- **AddOutsourcedPartController.java**:
    - Lines 40-59: Refactored code to accommodate min and max inventory logic and validation for errors.
- **mainscreen.html**:
    - Lines 42-45, 52-54: Added min and max inventory counters on the webpage.

### H. Add validation for between or at the maximum and minimum fields. The validation must include the following:
- **AddInhousePartController.java**:
    - Lines 43-50: Slight logic alteration for validation.
- **AddOutsourcedPartController.java**:
    - Lines 43-53: Slight logic alteration for validation.
- **EnufPartsValidator.java**:
    - Lines 28-54: Added method and logic for parts validation.

### I. Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
- **PartTest.java**:
    - Lines 7-8: Added imports for `InhousePart` and `Part`.
    - Lines 159-173: Added tests for min and max inventory.

### J. Remove the class files for any unused validators in order to clean your code.
- **deletepartvalidator.java**: Deleted as it is unused.
