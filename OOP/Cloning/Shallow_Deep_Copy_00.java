
// Shallow Copy: Primitive will be Copied as it is but the Refrence Variable

// clone() method of the object class support shallow copy of the object. If the
// object contains primitive
// as well as non primitive or reference type variable in shallow copy, the
// cloned object
// also refers to the same object to which the original object refers as only
// the object
// references gets copied and not the referred objects themselves.

// Deep Copy :whenever we need deep copy of the object we need to
// implement according to our need.

// So for deep copy we need to ensure all the member class also implement the
// Cloneable interface and override the clone() method of the object class.

// A deep copy means actually creating a new array and copying over the values.