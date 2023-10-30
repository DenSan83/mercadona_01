package com.devdensan.mercadona;

import com.devdensan.mercadona.model.Category;
import com.devdensan.mercadona.model.Product;
import com.devdensan.mercadona.model.Promotion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductModelAppTests {

	@Test
	void shouldCreateCategory() {
		// given
		String categoryName = "Boissons";

		// when
		Category category = new Category(categoryName);
		String result = category.toString();

		// then
		String expected = "Category{categoryId=0, categoryName='Boissons'}";
		assertEquals(expected, result);

	}

	@Test
	void shouldCreateProduct() {
		// given
		String name = "Lait Bonnelait";
		String description = "Bouteille 750ml";
		String image = "lait-bonnelait.png";
		float price = 9.95f;
		Category boissons = new Category("Boissons");

		// when
		Product product = new Product(name, description, image, price, boissons, null);
		String result = product.toString();

		// then
		String expected = "Product{" +
				"productId=0, " +
				"productName='Lait Bonnelait'" +
				", description='Bouteille 750ml'" +
				", image='lait-bonnelait.png'" +
				", price=9.95" +
				", category=Category{categoryId=0, categoryName='Boissons'}" +
				", promotion=null}";
		assertEquals(expected, result);
	}

	@Test
	void shouldCreatePromotion() {
		// given
		int discountPercentage = 10;
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 12, 31);

		// when
		Promotion promotion = new Promotion(discountPercentage, startDate, endDate);
		String result = promotion.toString();

		// then
		String expected = "Promotion{promotionId=0, discountPercentage=10"+
				", startDate=2023-01-01, endDate=2023-12-31}";
		assertEquals(expected, result);
	}

}
