package app09_online_market_map;

enum ProductType {
	skirt("ġ��"),pants("����"),socks("�縻"),shirt("����"),slacks("����"),hood("�ĵ�");
	final private String name;
	//������
	private ProductType(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
