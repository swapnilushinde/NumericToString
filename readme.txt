# Numeric to string representation
This method takes an integer and convert its string representation. 
Its a recursive solution and convert any number from zero to trillion integer. 
Logic -
	1) Its splits the number into 3 digits from left to right. - piece
	2) Then each piece converted into string representation. It can be one digits, two digits or three digits number. - getString() method
			Based upon this piece position we append either trillion, million, thousands.
	3) There is a hashMap for retrieving one digits numbers, and (10,20,30,40,50,60,70,80,90).
	
Classes -
	MainClass : main
	NumberConversion :Recursive conversion of integer number to string. (above logic)
	NumberConversionTest : Junit4 test cases

Other files -
	build.xml 
	 
