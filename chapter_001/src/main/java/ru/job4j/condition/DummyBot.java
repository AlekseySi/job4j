package ru.job4j.condition;

/**
 * @author Aleksey Siminko (mailto:alekseysimink@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * �������� �� �������.
     * @param question ������ �� �������.
     * @return �����.
     */
    public String answer(String question) {
        String rsl = "��� ������ ���� � �����. �������� ������ ������.";
        if ("������, ���.".equals(question)) {
            // �������� ... �� ���������� ����� rsl = "����� �� �������".
            rsl = "������, �����.";                    
        } else if (....) { // �������� ... �� ��������, ��� ���� ������ �������� ���� � �� ����� ��� �� ���� ��������.
            // �������� ... �� ���������� ����� rsl = "����� �� �������".
            rsl = "�� ������ �������.";
        }
        return rsl;
     }
}