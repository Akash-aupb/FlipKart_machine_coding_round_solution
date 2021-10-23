#Oxygen Dispersal System
###Description:
The Government of India is starting an Oxygen Dispersal System. In this Service, Hospitals and Industries can book Oxygen from vendors all across the country.
####Features:
1. Oxygen Vendors provide 2 kinds of Oxygen - Industrial and Medical.
2. These vendors are present all across the country. Only one vendor can be present in a city. Assume that city names are unique all across the country.
3. There are 2 kinds of consumers who can book oxygen - Hospitals and Industries.
4. A consumer can place an order as many times as possible but that order should never exceed its remaining capacity otherwise the order will not be executed.
5. If none of the vendors are having enough medical oxygen for fulfillment, then Hospitals can take Industrial oxygen but not vice versa.
6. When a booking is made, order should be placed with the single vendor with the highest available oxygen of consumer type.
7. Government should be able to check all the available vendors with their capacity sorted in decreasing order of sum of oxygen.
8. Citizens from Government Portal should be able to check all the hospitals in their city with their available capacity sorted in decreasing order.
9. Government should be able to check all the industries with their requirements sorted in decreasing order.

###Requirements:
1. Register a Vendor:
registerVendor(city, state, medicalOxygenCapacity, industrialOxygenCapacity) 

2. Register a Consumer:
registerConsumer(consumerId, consumerType  ,city, state, maximum requirement)

3. A Consumer should be able to book with a given quantity of oxygen:
bookOxygen(consumerId, quantity).<br>
If an industry makes an order it can just be ordered from Industrial capacity. <br>
If a hospital makes an order,
If none of the Vendors are having enough available medical oxygen then available capacity will be medical + industrial and the vendor with highest summation capacity(in case of multiple with same total, the one with higher medical capacity) would be chosen. 
Medical capacity will be prioritised over medical+industrial.
If multiple vendors have the same capacity, anyone can  be picked.

4. Show all Vendors in a state.
showAllvendors(state)
5. Show all the Vendors of the state sorted by decreasing order of their available total oxygen.
6. Show all Hospitals for a city.
showHospitals(city) 
7. Show all the hospitals of that city sorted by decreasing order of their available oxygen.
8. Show all Industries for a city.
showIndustries(city) 
9. Show all the industries of that city sorted by decreasing order of their total required oxygen.

####Bonus:
bookOxygenPreferState(id, requirement)
While making an order 1st prefer a vendor with highest current available capacity in the same state as consumer and then the capacity of the vendor.
Booking logic can be customized at state level for Hospitals whether fallback to industry oxygen is required or not.



####Sample Test Case:
All the inputs here are just indicating the high level inputs that function should accept. You are free to model entities as per your choice.
1. registerVendor(‘Bengaluru’, ‘Karnataka’, 100, 100)
2. registerVendor(Mysuru, ‘Karnataka’, 50, 100)
3. registerConsumer(‘H1’, ‘Hospital’, ‘Bengaluru’, ‘‘Karnataka’, 150)
4. registerConsumer(‘H2’, ‘Hospital’, ‘Bengaluru’, ‘‘Karnataka’, 150)
5. registerConsumer(‘I1’, Industry, ‘Bengaluru’, ‘‘Karnataka’, 150)
6. bookOxygen(‘H1’, 120)
Medical oxygen purchased successfully from Bengaluru Vendor, H1 can order more 30L oxygen.
7. bookOxygen(‘I1’, 100)
Industrial oxygen purchased successfully from Mysuru Vendor, I1 can order more 50L oxygen.
8.showVendors(‘Karnataka’)
Bengaluru, 0, 80
Mysuru, 50, 0
9.showHospitals(‘Bengaluru’):
H1, Bengaluru, Karnataka, 120(available capacity in hospital)
H2, Bengaluru, Karnataka, 0
10.showIndustries(‘Bengaluru’):
I1, Bengaluru, Karnataka, 50(required capacity in industry)


###Things to take care:
1. Do not use any database or NoSQL store, use in-memory store for now. 
2. Do not create any UI for the application.
3. Write a driver class for demo purposes which will execute all the commands at one place in the code and test cases.
4. Please prioritize code compilation, execution and completion.
5. Please do not access the internet for anything EXCEPT syntax.
6. You are free to use the language of your choice.
7.All work should be your own. If found otherwise, you may be disqualified.

####Expectations:
1. Code should be demoable (very important)
2. Complete coding within the duration of 90 minutes.
3. Prefer Design over optimization. Better design would be considered better.
4. Code should be modular, with Object Oriented design. Maintain good separation of concerns.
5. Code should be extensible. It should be easy to add/remove functionality without rewriting the entire codebase.
6. Code should handle edge cases properly and fail gracefully.
7. Code should be readable. Follow good coding practices:
8. Use intuitive variable names, function names, class names etc.
9. Indent code properly.





