public class Segment {
 private iVector m_start, m_end;
public Segment(iVector start, iVector end) {
 m_start = start;
 m_end = end;
 }
iVector getStart() {
 return m_start;
 }
iVector getEnd() {
 return m_end;
 }
double len() {
 return (m_end.sub(m_start)).len();
 }
double distanceTo(iVector point) {
 /* iVector a;
 if (len() == 0) {
 return m_start.sub(point).len();
 }
 a = m_end.sub(m_start).multiply(1 / len());
 iVector b=point;
 b.sub(m_start);
 double s = a.scalar(b);
 a = m_start.add(a.multiply(s));
 s = a.sub(point).len();
 if (m_start.sub(point).len() < m_end.sub(point).len()) {
 if (m_start.sub(point).len() < s) {
 s = m_start.sub(point).len();
 }
 } else {
 if (m_end.sub(point).len() < s)
 s = m_end.sub(point).len();
 }
 return s;*/
 double s;
 double P=((point.sub(m_start)).scalar(m_end.sub(m_start));//скалярное произведение двух векторов
 double L=(m_end.sub(m_start)).scalar(m_end.sub(m_start));
 if (0>=P) s=point.sub(m_start).len();//длина вектора
 if (P>=L) s=point.sub(m_end).len();
 if (0<P && P<L) s=point.sub(m_start.add((m_end.sub(m_start)).multiply(P/L))); }
public static void main(String args[]) {
 // Vector2D start=new Vector2D();
 // Vector2D end= new Vector2D(1,0);
 // Vector2D point=new Vector2D(0.5,0.5);
 Vector start = new Vector(4);
 Vector end = new Vector(new double[] { 1, 0, 0, 0 });
 Vector point = new Vector(new double[] { -1, 0, 0, 0 });
 Segment seg = new Segment(start, end);
 System.out.println(seg.distanceTo(point));
 }
 }
}
