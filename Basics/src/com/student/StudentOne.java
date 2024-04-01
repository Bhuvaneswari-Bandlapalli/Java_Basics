package com.student;

public class StudentOne {

	    private Integer id;
	    private String name;
	    private Integer firstLanguageMarks;
	    private Integer secondLanguageMarks;
	    private Integer thirdLanguageMarks;
	    private Integer mathsMarks;
	    private Integer scienceMarks;
	    private Integer socialMarks;

	    public StudentOne(int id, String name, int firstLanguageMarks, int secondLanguageMarks, int thirdLanguageMarks, int mathsMarks, int scienceMarks, int socialMarks) {
	        this.id = id;
	        this.name = name;
	        this.firstLanguageMarks = firstLanguageMarks;
	        this.secondLanguageMarks = secondLanguageMarks;
	        this.thirdLanguageMarks = thirdLanguageMarks;
	        this.mathsMarks = mathsMarks;
	        this.scienceMarks = scienceMarks;
	        this.socialMarks = socialMarks;
	    }
	    public StudentOne() {
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setFirstLanguageMarks(int firstLanguageMarks) {
	        this.firstLanguageMarks = firstLanguageMarks;
	    }

	    public void setSecondLanguageMarks(int secondLanguageMarks) {
	        this.secondLanguageMarks = secondLanguageMarks;
	    }

	    public void setThirdLanguageMarks(int thirdLanguageMarks) {
	        this.thirdLanguageMarks = thirdLanguageMarks;
	    }

	    public void setMathsMarks(int mathsMarks) {
	        this.mathsMarks = mathsMarks;
	    }

	    public void setScienceMarks(int scienceMarks) {
	        this.scienceMarks = scienceMarks;
	    }

	    public void setSocialMarks(int socialMarks) {
	        this.socialMarks = socialMarks;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getFirstLanguageMarks() {
	        return firstLanguageMarks;
	    }

	    public int getSecondLanguageMarks() {
	        return secondLanguageMarks;
	    }

	    public int getThirdLanguageMarks() {
	        return thirdLanguageMarks;
	    }

	    public int getMathsMarks() {
	        return mathsMarks;
	    }

	    public int getScienceMarks() {
	        return scienceMarks;
	    }

	    public int getSocialMarks() {
	        return socialMarks;
	    }
		@Override
		public String toString() {
			return "StudentOne [id=" + id + ", name=" + name + ", firstLanguageMarks=" + firstLanguageMarks
					+ ", secondLanguageMarks=" + secondLanguageMarks + ", thirdLanguageMarks=" + thirdLanguageMarks
					+ ", mathsMarks=" + mathsMarks + ", scienceMarks=" + scienceMarks + ", socialMarks=" + socialMarks
					+ "]";
		}
	}


