<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

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



E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.


Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.


K.  Demonstrate professional communication in the content and presentation of your submission.