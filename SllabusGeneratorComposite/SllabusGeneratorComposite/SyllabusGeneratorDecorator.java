public interface SyllabusGeneratorDecorator {

	private String courseName;

	private int courseNumber;

	public abstract void fetchPreviousYearSyllabus();

}
