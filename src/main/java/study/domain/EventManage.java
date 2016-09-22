package study.domain;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EventManage {
	public static void main(String[] args) throws InterruptedException {
		SessionFactory sessionFactory = HibernateUtill.getSessionFacetory();
		try {
			Session session = sessionFactory.getCurrentSession();
			session.getTransaction().begin();
			// Events event = (Events) session.load(Events.class, 11);
			// event.getPersons().add(new Person("ahihi", "", 24));
			// for (int i = 0; i < 10; i++) {
			//
			// Person person = new Person("cuong"+i);
			// person.getEventses().add(new Events("event"));
			// person.setAddress(new Address("hanoi"));
			// session.save(person);
			//
			// }
			// session.delete(session.load(Person.class, 10));
			// java.util.List<Person> persons=session.createQuery("from Person
			// as p where p.firstName like '%cu%'").list();
			// System.out.println(persons.size());

			// Iterator interator = session
			// .createQuery("select cat.color,count(cat.color) from Cat cat
			// group by cat.color ").list()
			// .iterator();
			// while (interator.hasNext()) {
			// Object[] objects = (Object[]) interator.next();
			// Color color = (Color) objects[0];
			// Long count = (Long) objects[1];
			// System.out.println(color.getName());
			//
			// }

			Criteria criteria = session.createCriteria(Cat.class);
			// criteria.setProjection(Projections.projectionList().add(Projections.max("age")));
			// System.out.println("size:"+criteria.uniqueResult());

			/* Chapter 17. Native SQL */
			SQLQuery sql;
			// sql= session.createSQLQuery("select * from cat").addScalar("id",
			// LongType.INSTANCE)
			// .addScalar("name", StringType.INSTANCE).addScalar("age",
			// IntegerType.INSTANCE);

			// sql=session.createSQLQuery("select * from
			// cat").addEntity(Cat.class);
			// List<Cat> cats = sql.list();

			// sql=session.createSQLQuery("select id,name,birth_day,age,color_id
			// from cat").addEntity(Cat.class);
			// List<Cat> cats = sql.list();

			// sql = session.createSQLQuery("select {c.*},{co.*} from cat c join
			// color co on c.color_id=co.id ")
			// .addEntity("c", Cat.class).addJoin("co","c.color");
			// List<Cat> cats = sql.list();
			// sql = session
			// .createSQLQuery(
			// "select id as {c.id},name as {c.name},birth_day as
			// {c.birth_day},{co.*} from cat c ,color co where c.color_id=co.id
			// ")
			// .addEntity("c", Cat.class).addEntity(Color.class);
			// List<Cat> cats = sql.list();

			/* Example about firstCache */
			/*
			 * Person person = (Person) session.load(Person.class, 8);
			 * System.out.println(person.getFirstName()); Thread.sleep(10000);
			 * person = (Person) session.load(Person.class, 8);
			 * System.out.println(person.getFirstName()); Session newSession =
			 * sessionFactory.openSession(); Person person2 = (Person)
			 * newSession.load(Person.class, 8); System.out.println("person_2:"
			 * + person2.getFirstName()); System.out.println("person:" +
			 * person.getFirstName());
			 * 
			 * session.evict(person); person.setFirstName("change forever");
			 * System.out.println(session.contains(person));
			 */
			/* End Example about firstCache */

			// transformer sql

			/*
			 * List<CatDTO> catDTOs = (List<CatDTO>) session
			 * .createSQLQuery("select name as pName,BirTh_Day as birthDay from Cat"
			 * ) .setResultTransformer(Transformers.aliasToBean(CatDTO.class)).
			 * list(); System.out.println(catDTOs.size());
			 */

			/* end Chapter 17. Native SQL */

			/* Chapter 19. Filtering data */

			/*
			 * Filter filter=session.enableFilter("ageFilter");
			 * filter.setParameter("age", 2); Set<Person> persons=(Set<Person>)
			 * ((Address)session.load(Address.class, 2)).getPersons(); for
			 * (Person person : persons) { System.out.println(person.getAge());
			 * 
			 * }
			 */

			Customer customer = new Customer();
			customer.setName("dao van cuong");
			// OrderDetail orderDetail = new OrderDetail();
			// orderDetail.setPrice(100);
			// orderDetail.setProductName("clear");
			// order.getOrderDetails().add(orderDetail);

			// Order order=new Order();
			// order.setCustomer(customer);//!importain
			// customer.getOrders().add(order);
			// order.setCustomer(new Customer());
			// order.setName("");
			// session.save(customer);
			// Order order=new Order();
			// order.setCustomer(new Customer());
			// session.persist(order);

			// customer=new Customer();
			// customer.getOrders().add(new Order());
			// session.persist(customer);
			// Customer customer2=(Customer) session.load(Customer.class,
			// "4028808857523757015752375a0d0000");
			// Order order=new Order();
			// order.setCustomer(customer2);
			// session.persist(order);

			// customer = new Customer();
			// Order order = new Order();
			// order.setCustomer(customer);
			// customer.getOrders().add(order);

			// session.persist(customer);

			// customer=(Customer) session.load(Customer.class,
			// "40288088575280450157528048e70000");
			// session.delete(customer);

			customer = (Customer) session.load(Customer.class, "402880885752b374015752b3776f0001");
			customer.setName("ohohohoho");
			session.refresh(customer);
			System.out.println(customer.getId());

			/* End Chapter 19. Filtering data */

			session.getTransaction().commit();
		} finally {
			if (sessionFactory != null) {
				sessionFactory.close();
			}
		}

	}

}
