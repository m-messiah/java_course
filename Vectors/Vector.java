public final class Vector implements iVector {
    private double[] m_v;
    public Vector(int n) {
        m_v = new double[n];
        for (int i = 0; i < n; m_v[i++] = 0);
    }
	public Vector(double[] c) {
		m_v = new double[c.length];
		m_v = c;
	}
	public int dimension() {
		return m_v.length;
	}
	public double getComponent(int i) {
		try {
				if (i < 0 || i >= m_v.length)
				throw new Exception("Индекс не принадлежит диапазону данной размерности\n");
				return m_v[i];
			} catch (Exception e) {
				e.printStackTrace(System.err);
				return 0;
			}
	}
	public double scalar(iVector v) {
		double res = 0;
		int a = m_v.length;
		int b = v.dimension();
		try {
			if (a != b) throw new Exception("Несовпадение размерностей\n");
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		for (int i = 0; i < a; i++) 
			res += m_v[i] * v.getComponent(i);
		return res;
	}
	public double len() {
		return Math.sqrt(scalar(this));
	}
	public Vector multiply(double factor) {
		double [] a=new double [m_v.length];
		for (int i = 0; i < m_v.length; i++)
			a[i]=m_v[i] * factor;
		return new Vector(a);
	}
	public Vector add(iVector v) {
		double [] a=new double [m_v.length];
		for (int i = 0; i < m_v.length; i++)
			a[i]=m_v[i] + v.getComponent(i);
		return new Vector(a);
	}
	public Vector sub(iVector v) {
		double [] a=new double [m_v.length];
		for (int i = 0; i < m_v.length; i++)
			a[i]=m_v[i] - v.getComponent(i);
		return new Vector(a);
	}
}
