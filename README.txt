bu proje ile flyweigth yapısal kalıbı anlatılmaktadır.
Projede orman oluşturulur. ormanda sadce ağaç vardır. Ağaçlar ise 1 tip üzerinden farklı isimler ile üretilir. Sonrasında flyweigth yapısı ile istenilen ağaç istenilen konuma yerleştirilir.

Manager.java : esas kod bloğudur. List<Tree> forest  ile temel orman nesnesi oluşturulur. İçeriğini doldurmak amacıyla,
				-> TreeFactory üzerinden cinar ve kavak isimlii ağaçlar üretilir. FTreeFactory nesne varsa mevcut nesneyi verir yoksa yeni üretir. Burada kontrol bunun üzerinden sağlanır.
				-> üretilen ağaçlar istenilen konumlara yerleştirilirken tek nesne olarak kullanılırlar. 
				-> dipnot. TreeTypeiçine set methodları koyulacak hale getirilebilir. Ardadından da istenilen konuma yerleştirilen nesne (kavak/cinar) değiştirilebilir.
TreeType.java : Burada amaç 3 değişkenli yapıda ağaç oluştumaktır.flyweigth bu sınıf nesnesi içindir.
TreeFactory.java : Ağaç nesne üretiminin kontrolü burada yapılır. nesne üretme fabrikasıdır.
Tree.java	: pozisyonu olan ağaçlardır. orman içinde kullanılırlar. bu nesne üretimi çokludur. flyweigth bu sınıf nesnesi için değildir.