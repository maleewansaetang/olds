package model;

public class PackageBean {
	String PackageName;
	String PackageDetail;
	public String getPackageName() {
		return PackageName;
	}
	public void setPackageName(String packageName) {
		PackageName = packageName;
	}
	public String getPackageDetail() {
		return PackageDetail;
	}
	public void setPackageDetail(String packageDetail) {
		PackageDetail = packageDetail;
	}
	@Override
	public String toString() {
		return "PackageBean [PackageName=" + PackageName + ", PackageDetail=" + PackageDetail + ", getPackageName()="
				+ getPackageName() + ", getPackageDetail()=" + getPackageDetail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public PackageBean(String packageName, String packageDetail) {
		super();
		PackageName = packageName;
		PackageDetail = packageDetail;
	}
	public PackageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}
