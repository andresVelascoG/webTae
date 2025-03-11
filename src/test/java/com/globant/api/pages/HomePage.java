package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import lombok.Data;
import lombok.extern.flogger.Flogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {
    public HomePage(WebDriver diver) {
        super(diver);
    }

    @FindBy(className = "inventory_list")
    private WebElement productsListDiv;

    @FindBy(className = "shopping_cart_link")
    private  WebElement cartButton;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenu;

    public WebElement getBurgerMenu(){
        return this.burgerMenu;
    }

    public MenuBar pressBurgerMenu(){
        burgerMenu.click();
        return new MenuBar(super.getDriver());
    }

    public WebElement getCartButton(){
        return cartButton;
    }

    public CartPage pressCartButton(){
        this.cartButton.click();
        return new CartPage(super.getDriver());
    }

    public WebElement getProductsListDiv() {
        return productsListDiv;
    }

    public List<WebElement> getProductsList(){
        return productsListDiv.findElements(By.className("inventory_item"));
    }

    public void slectEspecificElement(List<WebElement> elements, int position){
        WebElement selectedElement = elements.get(position);
        WebElement button = selectedElement.findElement(By.className("btn_inventory"));
        button.click();
    }

    public void selectRandomElementsAndClickButton(List<WebElement> divs) {
        ArrayList<WebElement> selectedDivs = new ArrayList<>();

        if (divs.size() < 3) {
            //I need to change this
            System.out.println("No hay suficientes elementos para seleccionar.");
            return;
        }

        Random random = new Random();

        while (selectedDivs.size() < 3) {
            int index = random.nextInt(divs.size());
            WebElement selectedDiv = divs.get(index);

            if (!selectedDivs.contains(selectedDiv)) {
                selectedDivs.add(selectedDiv);

                WebElement button = selectedDiv.findElement(By.className("btn_inventory"));
                button.click();
            }
        }
    }
}
