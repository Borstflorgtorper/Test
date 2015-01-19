package Database;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Jenny
 */
public class DBHelper {

    Session session = null;

    public DBHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List getChannelData(int datetime) {
        List<Datalogg> channelList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from datalogg.datalogg where Date/Time = " + datetime);       //Actor as actor where actor.actorId in (select filmActor.actor.actorId from FilmActor as filmActor where filmActor.film.filmId='" + filmId + "')
            channelList = (List<Datalogg>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return channelList;
    }

    public double getChanneldata(int channelno) {
        List<Datalogg> channelList = null;
        double channeldata = 0;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("select " + channelno + "from datalogg.datalogg");       //Actor as actor where actor.actorId in (select filmActor.actor.actorId from FilmActor as filmActor where filmActor.film.filmId='" + filmId + "')
            channelList = (List<Datalogg>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (channelList.size() > 0) {
            Datalogg cl = (Datalogg) channelList.get(0);
            switch (channelno) {
                case 1:
                    channeldata = cl.getChannel1();
                    break;
                case 2:
                    channeldata = cl.getChannel2();
                    break;
                case 3:
                    channeldata = cl.getChannel3();
                    break;
                case 4:
                    channeldata = cl.getChannel4();
                    break;
                case 5:
                    channeldata = cl.getChannel5();
                    break;
                case 6:
                    channeldata = cl.getChannel6();
                    break;
                case 7:
                    channeldata = cl.getChannel7();
                    break;
                case 8:
                    channeldata = cl.getChannel8();
                    break;
                default:
                    System.out.println("no such channel");

            }

        }
        return channeldata;
    }

}
