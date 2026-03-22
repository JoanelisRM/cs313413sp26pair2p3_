package edu.luc.etl.cs313.android.shapes.model;

import java.util.List;

/**
 * A special case of a group consisting only of Points.
 */
public final class Polygon extends Group {

    public Polygon(final Point... points) {
        super(points);
    }

    @SuppressWarnings("unchecked")
    public List<Point> getPoints() {
        return (List<Point>) getShapes();
    }

    @Override
    public <Result> Result accept(final Visitor<Result> v) {
        return v.onPolygon(this);
    }
}
