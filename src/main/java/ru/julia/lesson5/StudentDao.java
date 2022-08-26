package ru.julia.lesson5;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {
    //почему не создаем HibernateSessionFactoryUtil?
    //потому что запретили это делать(приватный конструктор), и нет смысла создавать экземпляры класса,
    //так как все методы в нем статические

    public Student findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public void save(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(student);
        tx1.commit();
        session.close();
    }

    public void update(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    public void delete(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }

    public List<Student> findAll() {
        List<Student> students = (List<Student>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Student").list();
        return students;
    }
}
