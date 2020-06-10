Feature: Ajio
Scenario: Ajio Pasitive case
Given Open browser
Given Load ajio url

And Mouseover on Women, CATEGORIES and click on Kurtas
And Click on Brands and choose Ajio
And Check all the results are Ajio
And Set Sort by the result as Discount
And Select the first product
And Select the Color and click ADD TO BAG
And Verify the error message Select your size to know your estimated delivery date
And Select size and click ADD TO BAG
And click on Enter pin-code to know estimated delivery date