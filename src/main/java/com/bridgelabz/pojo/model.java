package com.bridgelabz.pojo;

import com.opencsv.bean.CsvBindByName;

/*
 * @Description - Pojo class for reading CSV file directly into a list of beans
 * @Methods: getters and setters
 * @Data members: source, target, type, weight, book
 * 
 */
public class model {

    @CsvBindByName(column = "Source", required = true)
    private String source;

    @CsvBindByName(column = "Target")
    private String target;

    @CsvBindByName(column = "Type")
    private String type;

    @CsvBindByName(column = "Weight")
    private String weight;

    @CsvBindByName(column = "Book")
    private String book;

	/*
	 * @Description - Getter method for source
	 * 
	 * @Params - void
	 * 
	 * @Return - String source
	 */
	public String getSource() {
		return source;
	}

	/*
	 * @Description - Setter method for source
	 * 
	 * @Params - String source
	 * 
	 * @Return - void
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/*
	 * @Description - Getter method for target
	 * 
	 * @Params - void
	 * 
	 * @Return - String target
	 */
	public String getTarget() {
		return target;

	}

	/*
	 * @Description - Setter method for target
	 * 
	 * @Params - String target
	 * 
	 * @Return - void
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/*
	 * @Description - Getter method for type
	 * 
	 * @Params - void
	 * 
	 * @Return - String type
	 */
	public String getType() {
		return type;

	}

	/*
	 * @Description - Setter method for type
	 * 
	 * @Params - String type
	 * 
	 * @Return - void
	 */
	public void setType(String type) {
		this.type = type;
	}

	/*
	 * @Description - Getter method for weight
	 * 
	 * @Params - void
	 * 
	 * @Return - String weight
	 */
	public String getWeight() {
		return weight;

	}

	/*
	 * @Description - Setter method for weight
	 * 
	 * @Params - String weight
	 * 
	 * @Return - void
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/*
	 * @Description - Getter method for book
	 * 
	 * @Params - void
	 * 
	 * @Return - String book
	 */
	public String getBook() {
		return book;

	}

	/*
	 * @Description - Setter method for book
	 * 
	 * @Params - String book
	 * 
	 * @Return - void
	 */
	public void setBook(String book) {
		this.book = book;
	}

    /*
     * @Description - Overriding toString method
     * 
     * @Params - void
     * 
     * @Return - String
     */
    @Override
    public String toString() {
        return "model [source=" + source + ", target=" + target + ", type=" + type + ", weight=" + weight + ", book="
                + book + "]";
    }
}