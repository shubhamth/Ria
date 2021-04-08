package com.ria.services;

public class AppUserDetailsService  {
	
    @Autowired
    private UserService userService;
    @Autowired
    private RoleRepository roleRepository;
	 
	@Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.findUserByUserName(userName);
        List<Role> authorities = getUserAuthority(user.getRoles());
        return buildUserForAuthentication(user, authorities);
    }

    private List<Role> getUserAuthority(List<Role> list) {
        List<Role> roles = new ArrayList<Role>();
        for (Role role : list) {
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        }
        List<Role> grantedAuthorities = new ArrayList<>(roles);
        return grantedAuthorities;
    }

    private UserDetails buildUserForAuthentication(User user, List<Role> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                true, true, true, true, authorities);
    }
}
