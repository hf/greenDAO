package de.greenrobot.daogenerator;

public class Annotation {
    private String annotation;

    public Annotation(String annotation) {

        setAnnotation(annotation);
    }

    public String getAnnotation() {

        return annotation;
    }

    public void setAnnotation(String annotation) {

        if (annotation == null) {
            throw new IllegalArgumentException("Annotation must not be null.");
        }

        this.annotation = annotation;
    }

    @Override
    public int hashCode() {

        return annotation.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Annotation) {
            return annotation.equals(((Annotation) obj).getAnnotation());
        }

        return super.equals(obj);
    }
}
