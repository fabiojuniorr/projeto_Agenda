package br.com.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * classe respons�vel por ger�nciar a conec��o com o banco de dados; autor:
 * Fabio Jr. sice: 16.03.2014
 */

/*
 * Um SessionFactory representa uma determinada configura��o de reposit�rio de
 * dados usando o hibernate. O EntityManagerFactory possui o mesmo papel em uma
 * aplica��o JPA, � um objeto de tempo de exce��o que representa uma unidade de
 * persist�ncia. Voc� utiliza o SessionFactory quando voc� est� usando
 * Hibernate. No seu caso, voc� est� usando JPA, por isso o uso do
 * EntityMangerFactory.
 */

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	public static final String HIBERNATE_SESSION = "hibernate_session";

	static {
		try {
			System.out.println("Tentando criar sessionFactory");
			Configuration configuration = new Configuration().configure();

			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.buildServiceRegistry();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			System.out.println("sessionFactory criada com sucesso!");
		} catch (Exception e) {
			System.out
					.println("Ocorreu um erro ao inicializar a sessionFactory"
							+ e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
