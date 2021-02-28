package com.mrBeanCars.webapp.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mrBeanCars.webapp.entity.Cars;
import com.mrBeanCars.webapp.repositories.CarRespositories;

@Controller
public class CarsController {

	@Autowired
	CarRespositories carRepo;

	@RequestMapping("/addCar")
	public String addNewCarS() {
		return "addNewCar";
	}

	@RequestMapping("/saveCar")
	public String saveNewCar(@ModelAttribute("car") Cars car, ModelMap modelMap) {

		if (car != null) {
			try {
				carRepo.save(car);

				List<Cars> cars = carRepo.findAll();
				modelMap.addAttribute("cars", cars);

				return "mrBeanCars";

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		modelMap.addAttribute("Msg", "Please fill the form before save");
		return "addNewCar";
	}

	@RequestMapping("/listOfCars")
	public String listOfCars(ModelMap modelMap) {

		List<Cars> cars = carRepo.findAll();
		modelMap.addAttribute("cars", cars);

		return "mrBeanCars";
	}

	@RequestMapping("/searchByKeyword")
	public String listOfCarsByModel(@RequestParam("keyword") String keyword, ModelMap modelMap) {

		List<Cars> cars = carRepo.findByKeyword(keyword);
		modelMap.addAttribute("cars", cars);

		return "mrBeanCars";
	}

	@RequestMapping("/searchByPriceBetween")
	public String listOfCarsByPriceRange(@RequestParam(value = "from") String from,
			@RequestParam(value = "to") String to, ModelMap modelMap) {

		if (from != null & to != null) {

			try {
				int end = Integer.parseInt(to);
				int start = Integer.parseInt(from);

				List<Cars> cars = carRepo.findAllByPriceBetween(start, end);
				modelMap.addAttribute("cars", cars);

				return "mrBeanCars";

			} catch (Exception e) {
				System.out.println(e);
			}
		}

		modelMap.addAttribute("msg", "No Cars Found. Please enter all the fields to get car details");
		return "mrBeanCars";
	}

	@RequestMapping("/deleteCar")
	public String deleteCar(@RequestParam("id") Long id, ModelMap modelMap) {

		carRepo.deleteById(id);
		List<Cars> cars = carRepo.findAll();
		modelMap.addAttribute("cars", cars);

		return "mrBeanCars";
	}

	@RequestMapping("/updateCar")
	public String updateCarDetails(@RequestParam("id") Long id, ModelMap modelMap) {

		Optional<Cars> findById = carRepo.findById(id);
		Cars car = findById.get();

		modelMap.addAttribute("id", car.getId());
		modelMap.addAttribute("company", car.getCompany());
		modelMap.addAttribute("model", car.getModel());
		modelMap.addAttribute("colour", car.getColour());
		modelMap.addAttribute("dateOfPurchase", car.getDateOfPurchase());
		modelMap.addAttribute("price", car.getPrice());
		modelMap.addAttribute("engineCapacity", car.getEngineCapacity());
		modelMap.addAttribute("licencePlateNumber", car.getLicencePlateNumber());
		modelMap.addAttribute("seatingCapacity", car.getSeatingCapacity());

		return "editCarDetails";

	}

	@RequestMapping("/updatedCar")
	public String updatedCar(@ModelAttribute("car") Cars car, ModelMap modelMap) {

		if (car != null) {
			try {
				carRepo.save(car);
				modelMap.addAttribute("UpdateMsg",
						"ID Number " + car.getId() + " car details has been updated successfully.");

				List<Cars> cars = carRepo.findAll();
				modelMap.addAttribute("cars", cars);

				return "mrBeanCars";

			} catch (Exception e) {
				System.out.println(e);
			}
		}

		List<Cars> cars = carRepo.findAll();
		modelMap.addAttribute("cars", cars);
		modelMap.addAttribute("UpdateMsg",
				"Please fill all the field to update car details of ID Number " + car.getId());

		return "mrBeanCars";
	}
}
