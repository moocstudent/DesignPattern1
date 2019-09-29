package destination_version.visit;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
