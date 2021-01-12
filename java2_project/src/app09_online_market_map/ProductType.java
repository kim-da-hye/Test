package app09_online_market_map;

enum ProductType {
	skirt("치마"),pants("바지"),socks("양말"),shirt("셔츠"),slacks("바지"),hood("후드");
	final private String name;
	//생성자
	private ProductType(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
