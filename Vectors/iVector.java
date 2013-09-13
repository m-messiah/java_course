public interface iVector {
 public int dimension(); // размерность
double getComponent(int i); // возвращает компоненту вектора
double scalar(iVector v);
double len();
iVector multiply(double factor);
iVector add(iVector v);
iVector sub(iVector v);
}
}
