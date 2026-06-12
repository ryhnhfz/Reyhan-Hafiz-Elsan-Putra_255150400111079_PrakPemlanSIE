class NodeString {

    String data;
    NodeString left, right;

    NodeString(String data) {
        this.data = data;
    }

    public void add(String data) {

        if (data.compareTo(this.data) > 0) {

            if (right == null)
                right = new NodeString(data);
            else
                right.add(data);

        }

        if (data.compareTo(this.data) < 0) {

            if (left == null)
                left = new NodeString(data);
            else
                left.add(data);

        }
    }
}