public final class Vector2D implements iVector {
 private Double m_x, m_y;
public Vector2D() {
 m_x = 0.0;
 m_y = 0.0;
 }
public Vector2D(double x, double y) {
 m_x = x;
 m_y = y;
 }
public int dimension() // размерность
 {
 return 2;
 }
public double getComponent(int i) // возвращает компоненту вектора
 {
 return i == 0 ? m_x : m_y;
 }
public double scalar(iVector v) {
 return m_x * v.getComponent(0) + m_y * v.getComponent(1);
 }
public double len() {
 return Math.sqrt(m_x * m_x + m_y * m_y);
 }
public Vector2D multiply(double factor) {
 m_x = m_x * factor;
 m_y = m_y * factor;
 return new Vector2D(m_x, m_y);
 }
public Vector2D add(iVector v) {
 m_x = m_x + v.getComponent(0);
 m_y = m_y + v.getComponent(1);
 return new Vector2D(m_x, m_y);
 }
public Vector2D sub(iVector v) {
 m_x = m_x - v.getComponent(0);
 m_y = m_y - v.getComponent(1);
 return new Vector2D(m_x, m_y);
 }
 }
