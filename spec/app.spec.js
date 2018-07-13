// Delete a card when the 'x' button is click
describe('deleteCard', function(){
    it('should remove a card when its "x" button is clicked', function(){
    //1. create a card
        var card = document.createElement('section')
    //2. create a header
        var header = document.createElement('header')
    //3. create an 'x' button
        var button = document.createElement('button')
    //4. add button to header
        header.appendChild(button)
    //5. add header to card
        card.appendChild(header)
    //6. add event listener to button

    //7. remove card on click

    document.body.appendChild(card)
    button.click()
    expect(document.querySelector('card')).toBeNull
    })
})

/*describe('deleteCardOnClickX', function(){
	it('should delete card when x is clicked', function(){
		expect(deleteCardOnClickX());
	})
})*/


// Display navigation when menu button is clicked
describe(' showNavMenu', function() {
    it('shows navigation menu when MENU button is clicked ', function() {
        var navMenu = document.createElement('nav');
        var unorderedListOfNavigationMenu = document.createElement('ul');
        unorderedListOfNavigationMenu.classList.add('newNav');
        var button = document.createElement('button');
        navMenu.appendChild(button);
        navMenu.appendChild(unorderedListOfNavigationMenu);
        
        showNavMenu(button.nextElementSibling);
        expect(unorderedListOfNavigationMenu.classList.contains('newNav')).toBe(false);
    });
});


// Make a new card with the 'New Card' form

// Add 'active' class to navigation elements when they are clicked

// Remove 'active' class from other navigation elements when one is clicked
