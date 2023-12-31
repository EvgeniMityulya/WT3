package org.iseedeadpeopleq.service;

import org.iseedeadpeopleq.beans.User;
import org.iseedeadpeopleq.service.exception.AlreadyExistException;
import org.iseedeadpeopleq.service.exception.ServiceException;

import java.util.List;
import java.util.Optional;

public interface UserService {
    /**
     *
     * @return
     * @throws ServiceException
     */
    List<User> getUsers() throws ServiceException;

    /**
     *
     * @param name
     * @return
     * @throws ServiceException
     */
    Optional<User> getUserByUsername(String name) throws ServiceException;

    /**
     *
     * @param id
     * @return
     * @throws ServiceException
     */
    Optional<User> getUserById(int id) throws ServiceException;

    /**
     * @param email
     * @param password
     * @param username
     * @throws ServiceException
     * @throws AlreadyExistException
     */
    void newUser(String email, String password, String username) throws ServiceException;

//    /**
//     *
//     * @param login
//     * @param password
//     * @return
//     * @throws ServiceException
//     * @throws UnknownUserException
//     */
//    void authenticate(String login, String password) throws ServiceException, UnknownUserException;

    /**
     *
     * @throws ServiceException
     */
    void updateRate() throws ServiceException;

    /**
     *
     * @param id
     * @throws ServiceException
     */
    void deleteUser(int id) throws ServiceException;

    /**
     *
     * @param id
     * @throws ServiceException
     */
    void changeStatus(int id) throws ServiceException;
}
